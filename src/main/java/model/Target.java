package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
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
