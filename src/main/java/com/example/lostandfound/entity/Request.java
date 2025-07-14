package com.example.lostandfound.entity;

import com.example.lostandfound.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Item item;

    @ManyToOne
    private User requester;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;
}
