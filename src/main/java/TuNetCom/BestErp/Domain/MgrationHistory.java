package TuNetCom.BestErp.Domain;

public final class MgrationHistory {
    private String migrationId ;
    private String contextKey ;
    private byte model;
    private String productVersion ;

    public MgrationHistory(String migrationId, String contextKey, byte model, String productVersion) {
        this.migrationId = migrationId;
        this.contextKey = contextKey;
        this.model = model;
        this.productVersion = productVersion;
    }
    public String getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    public String getContextKey() {
        return contextKey;
    }

    public void setContextKey(String contextKey) {
        this.contextKey = contextKey;
    }

    public byte getModel() {
        return model;
    }

    public void setModel(byte model) {
        this.model = model;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }





}
