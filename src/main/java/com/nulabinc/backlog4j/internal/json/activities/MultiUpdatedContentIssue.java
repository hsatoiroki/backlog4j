package com.nulabinc.backlog4j.internal.json.activities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.nulabinc.backlog4j.*;
import com.nulabinc.backlog4j.internal.json.ChangeJSONImpl;
import com.nulabinc.backlog4j.internal.json.CommentJSONImpl;
import com.nulabinc.backlog4j.internal.json.LinkJSONImpl;

import java.util.Arrays;
import java.util.List;

/**
 * @author nulab-inc
 */
public class MultiUpdatedContentIssue extends Content {

    @JsonProperty("tx_id")
    private int txId;
    @JsonDeserialize(as=CommentJSONImpl.class)
    private Comment comment;
    @JsonDeserialize(as=LinkJSONImpl[].class)
    private Link[] link;
    @JsonDeserialize(as=ChangeJSONImpl[].class)
    private Change[] changes;

    public long getTxId() {
        return txId;
    }

    public List<Link> getLink() {
        return Arrays.asList(link);
    }

    public List<Change> getChanges() {
        return Arrays.asList(changes);
    }

    public Comment getComment() {
        return comment;
    }
}