package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"guid"})
@Entity
@ToString(exclude = {"content"})
@Table(name = "target")
public class Target {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID guid;
    @JoinColumn(name = "user_guid")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    @JoinColumn(name = "content_guid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Content content;
    @Column
    private Page page;
    @Column
    private int priority;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;

}
