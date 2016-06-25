package com.bitbucketflow;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class RoomDetails implements Serializable{
	
	@JsonProperty("setup_page_uri")
	private String setupPageUri;
	@JsonProperty("instance_integration_type")
	private String instanceIntegrationType;
	@JsonProperty("edit_page_uri")
	private String editPageUri;
	@JsonProperty("instance_base_url")
	private String instanceBaseUrl;
	@JsonProperty("delete_page_uri")
	private String deletePageUri;
	@JsonProperty("instance_api_version")
	private String instanceApiVersion;
	@JsonProperty("integration_id")
	private String integrationId;
	public String getSetupPageUri() {
		return setupPageUri;
	}
	public void setSetupPageUri(String setupPageUri) {
		this.setupPageUri = setupPageUri;
	}
	public String getInstanceIntegrationType() {
		return instanceIntegrationType;
	}
	public void setInstanceIntegrationType(String instanceIntegrationType) {
		this.instanceIntegrationType = instanceIntegrationType;
	}
	public String getEditPageUri() {
		return editPageUri;
	}
	public void setEditPageUri(String editPageUri) {
		this.editPageUri = editPageUri;
	}
	public String getInstanceBaseUrl() {
		return instanceBaseUrl;
	}
	public void setInstanceBaseUrl(String instanceBaseUrl) {
		this.instanceBaseUrl = instanceBaseUrl;
	}
	public String getDeletePageUri() {
		return deletePageUri;
	}
	public void setDeletePageUri(String deletePageUri) {
		this.deletePageUri = deletePageUri;
	}
	public String getInstanceApiVersion() {
		return instanceApiVersion;
	}
	public void setInstanceApiVersion(String instanceApiVersion) {
		this.instanceApiVersion = instanceApiVersion;
	}
	public String getIntegrationId() {
		return integrationId;
	}
	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}
	
	
	
	
	

}
