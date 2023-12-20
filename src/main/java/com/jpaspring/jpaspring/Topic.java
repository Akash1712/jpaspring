package com.jpaspring.jpaspring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Topic {

    @Id
    private int topicId;
    private String topicName;
    private String topicDescription;

}
