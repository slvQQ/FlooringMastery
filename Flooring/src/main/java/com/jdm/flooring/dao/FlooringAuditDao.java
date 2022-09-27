package com.jdm.flooring.dao;

public interface FlooringAuditDao {
    
    /**
     * Appends parameter entry to audit file.
     * @param entry
     * @throws FlooringDaoException
     */
    public void writeAuditEntry(String entry) throws FlooringDaoException;
}
