package kg.itmegaschool.crmitmega.model.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data // Getters // Setters // ToString // EqualsAndHashcode
@MappedSuperclass
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    Long id;

    @Column(name = "is_deleted", nullable = false)
    Boolean isDeleted;

    @Column(name = "date_created", nullable = false)
    LocalDateTime dateCreated;

    @Column(name = "date_updated", nullable = true)
    LocalDateTime dateUpdated;

    @PrePersist
    public void onCreate() {
        isDeleted = false;
        dateCreated = LocalDateTime.now();
    }

    @PostUpdate
    public void onUpdate() {
        dateUpdated = LocalDateTime.now();
    }
}
