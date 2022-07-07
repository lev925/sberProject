package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"guid"})
@Entity
@ToString(exclude = {"userGuid","contentGuid"})
@Table(name = "target")
public class Target {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID guid;
    @Column(name = "user_guid")
    private UUID userGuid;
    @Column(name = "content_guid")
    private UUID contentGuid;
    @Column
    private Page page;
    @Column
    private int priority;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;

}
