package com.example.lostandfound.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    @ManyToOne
    private User reportedBy;
}

