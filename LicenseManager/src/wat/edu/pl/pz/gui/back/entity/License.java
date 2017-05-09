package wat.edu.pl.pz.gui.back.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class License implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -7411865507330633479L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private long id;
    @Column(unique = true)
    private String licenseNumber;
    private String licenseName;
    private int instalationTime;
    private String licenseDescription;
    private String version;
    private boolean restartRequired;
    private Date validFrom;
    private Date validTo;
    private int status;
    @ManyToOne
    private Provider provider;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getInstalationTime() {
        return instalationTime;
    }

    public void setInstalationTime(int instalationTime) {
        this.instalationTime = instalationTime;
    }

    public String getLicenseDescription() {
        return licenseDescription;
    }

    public void setLicenseDescription(String licenseDescription) {
        this.licenseDescription = licenseDescription;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isRestartRequired() {
        return restartRequired;
    }

    public void setRestartRequired(boolean instalationStatus) {
        this.restartRequired = instalationStatus;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }
}
