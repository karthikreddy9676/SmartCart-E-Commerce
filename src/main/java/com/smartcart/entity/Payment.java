//package com.smartcart.entity;
//
//import jakarta.persistence.*;
//
//
//import java.time.LocalDateTime;
//
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.SequenceGenerator;
//import jakarta.persistence.Table;
//import jakarta.persistence.Version;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "payments")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Payment {
//
//    @Id
//
//    @SequenceGenerator(name="gen1",sequenceName = "payment_seq1",initialValue = 1,allocationSize = 1)
//    @GeneratedValue( generator = "gen1",strategy = GenerationType.SEQUENCE)
//    private Long payment_Id;
//    
//    @ManyToOne(targetEntity = Order.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="oder_Id",referencedColumnName = "payment_Id")
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long paymentId;
//
//    @OneToOne(mappedBy = "payment", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//
//    private Order order;
//
//   
//    private String paymentMethod;
//
//    private String pgPaymentId;
//    private String pgStatus;
//    private String pgResponseMessage;
//
//    private String pgName;
//
//
//    public Payment(String paymentMethod, String pgPaymentId, String pgStatus,
//                   String pgResponseMessage, String pgName) {
//        this.paymentMethod = paymentMethod;
//        this.pgPaymentId = pgPaymentId;
//        this.pgStatus = pgStatus;
//        this.pgResponseMessage = pgResponseMessage;
//        this.pgName = pgName;
//    }
//}
