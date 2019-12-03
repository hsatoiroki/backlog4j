package com.nulabinc.backlog4j.api.option;

import com.nulabinc.backlog4j.http.NameValuePair;

/**
 * Parameters for update status API.
 *
 * @author nulab-inc
 */
public class UpdateStatusParams extends PatchParams {

    private Object projectIdOrKey;
    private Object statusId;

    public UpdateStatusParams(Object projectIdOrKey, Object statusId, String name) {
        this.projectIdOrKey = projectIdOrKey;
        this.statusId = statusId;
        parameters.add(new NameValuePair("name", name));
    }


    public String getProjectIdOrKeyString() {
        return projectIdOrKey.toString();
    }

    public String getStatusId() {
        return statusId.toString();
    }
}
