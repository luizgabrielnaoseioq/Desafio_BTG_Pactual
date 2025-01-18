package tech.buildrun.btgpactual.orderms.entity;

import jakarta.persistence.GenerationType;
import lombok.*;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tb_orders")
public class OrderEntity {

    @MongoId
    private Long orderId;

    @Indexed(name = "customer_id_index")
    private Long customerID;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal total;

    private List<OrderItem> items;

    public OrderEntity(Long orderId) {

    }

    public void setTotal(BigDecimal total) {
    }

    public void setCustomerId(Long aLong) {
    }
}
