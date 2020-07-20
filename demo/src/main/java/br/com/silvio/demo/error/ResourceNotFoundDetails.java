package br.com.silvio.demo.error;

public class ResourceNotFoundDetails {
    
    private String title;
    private int status;
    private String detail;
    private long timestamp;
    private String developerMessage;

    private ResourceNotFoundDetails(){
    }

    public String getTitle() {
        return this.title;
    }

    public int getStatus() {
        return this.status;
    }

    public String getDetail() {
        return this.detail;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getDeveloperMessage() {
        return this.developerMessage;
    }
	public void setTitle(String title) {
        this.title = title;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public static final class Builder {
        private String title;
        private int status;
        private String detail;
        private long timestamp;
        private String developerMessage;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails details = new ResourceNotFoundDetails();
            details.setDeveloperMessage(developerMessage);
            details.setTitle(title);
            details.setDetail(detail);
            details.setTimestamp(timestamp);
            details.setStatus(status);
            return details;
        }
    }

}