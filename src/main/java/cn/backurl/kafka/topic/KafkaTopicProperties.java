package cn.backurl.kafka.topic;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author: akid
 * @create: 2019-11-27 16:05
 **/
@ConfigurationProperties("kafka.topic")
public class KafkaTopicProperties implements Serializable {

    private String groupId = "akidGroup";
    private String[] topicName = {"akidTopic2"};

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String[] getTopicName() {
        return topicName;
    }

    public void setTopicName(String[] topicName) {
        this.topicName = topicName;
    }
}
