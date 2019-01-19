package org.keycloak.quickstarts.devconf2019.service;

/**
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public class OwnerRepresentation {

    private String ownerId;
    private String ownerUsername;

    public OwnerRepresentation() {
    }


    public OwnerRepresentation(String ownerId, String ownerUsername) {
        this.ownerId = ownerId;
        this.ownerUsername = ownerUsername;
    }


    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    @Override
    public int hashCode() {
        return ownerId.hashCode() * 13 + ownerUsername.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (!(obj instanceof OwnerRepresentation)) {
            return false;
        }

        OwnerRepresentation that = (OwnerRepresentation) obj;
        return that.ownerId.equals(ownerId) && that.ownerUsername.equals(ownerUsername);
    }

    @Override
    public String toString() {
        return "OwnerRepresentation{" +
                "ownerId='" + ownerId + '\'' +
                ", ownerUsername='" + ownerUsername + '\'' +
                '}';
    }
}
