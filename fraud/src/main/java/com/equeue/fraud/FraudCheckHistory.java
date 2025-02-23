package com.equeue.fraud;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fraud_check_history")
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(name = "fraud_check_history_id_sequence", sequenceName = "fraud_check_history_id_sequence")
    @GeneratedValue(generator = "fraud_check_history_id_sequence", strategy = GenerationType.SEQUENCE)
    private Integer id;

    private Integer customerId;

    private Boolean isFraudster;

    private LocalDateTime createdAt;
}
