package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
    @JoinColumn(name = "user_guid")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    @JoinColumn(name = "content_guid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Content content;
}
