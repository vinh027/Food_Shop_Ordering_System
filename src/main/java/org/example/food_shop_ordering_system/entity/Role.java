package org.example.food_shop_ordering_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    @Column(name = "role_code", nullable = false, unique = true, length = 3)
    private String roleCode;

    @Column(name = "role_name", nullable = false, length = 20)
    private String roleName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "status", nullable = false, length = 10)
    private String status;
}
