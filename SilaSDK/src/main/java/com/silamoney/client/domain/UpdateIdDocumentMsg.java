package com.silamoney.client.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Message used for updating ID documents.
 *
 * @author Icon Systems
 */
public class UpdateIdDocumentMsg {
    
    @SerializedName("header")
    private final HeaderMsg header;
    
    @SerializedName("uuid")
    private final String uuid;
    
    @SerializedName("doc_type")
    private final String docType;
    
    @SerializedName("doc_id")
    private final String docId;
    
    @SerializedName("doc_state")
    private final String docState;

    public UpdateIdDocumentMsg(String userHandle, String appHandle, String uuid, String docType, String docId, String docState) {
        this.header = new HeaderMsg(userHandle, appHandle, null);
        this.uuid = uuid;
        this.docType = docType;
        this.docId = docId;
        this.docState = docState;
    }

    /**
     * Gets the header.
     *
     * @return the header
     */
    public HeaderMsg getHeader() {
        return header;
    }

    /**
     * Gets the document UUID.
     *
     * @return the document UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Gets the document type.
     *
     * @return the document type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Gets the document ID.
     *
     * @return the document ID
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Gets the document state.
     *
     * @return the document state
     */
    public String getDocState() {
        return docState;
    }
} 