package pl.michal.pizza.data.entity.order;

import pl.michal.pizza.data.entity.ordersize.OrdersSizesEntity;
import pl.michal.pizza.domain.model.StatusType;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "floor")
    private String floor;

    @Column(name = "token")
    private String token;

    @Column(name = "status")
    private StatusType status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expected_at")
    private Date expectedAt;

    @OneToMany(mappedBy = "order_id")
    private Set<OrdersSizesEntity> orderSizes;
}
