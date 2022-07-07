package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "viewed")
public class Viewed {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID guid;
    @Column(name = "user_guid")
    private UUID userGuid;
    @Column(name = "content_guid")
    private UUID contentGuid;
}
