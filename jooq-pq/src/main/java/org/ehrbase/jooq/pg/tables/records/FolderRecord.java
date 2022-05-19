/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import com.nedap.archie.rm.datastructures.ItemStructure;

import java.sql.Timestamp;
import java.util.AbstractMap.SimpleEntry;
import java.util.UUID;

import org.ehrbase.jooq.pg.tables.Folder;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FolderRecord extends UpdatableRecordImpl<FolderRecord> implements Record9<UUID, UUID, String, String, Boolean, ItemStructure, Timestamp, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.folder.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.folder.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ehr.folder.in_contribution</code>.
     */
    public void setInContribution(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.folder.in_contribution</code>.
     */
    public UUID getInContribution() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>ehr.folder.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ehr.folder.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ehr.folder.archetype_node_id</code>.
     */
    public void setArchetypeNodeId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ehr.folder.archetype_node_id</code>.
     */
    public String getArchetypeNodeId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ehr.folder.active</code>.
     */
    public void setActive(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>ehr.folder.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>ehr.folder.details</code>.
     */
    public void setDetails(ItemStructure value) {
        set(5, value);
    }

    /**
     * Getter for <code>ehr.folder.details</code>.
     */
    public ItemStructure getDetails() {
        return (ItemStructure) get(5);
    }

    /**
     * Setter for <code>ehr.folder.sys_transaction</code>.
     */
    public void setSysTransaction(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>ehr.folder.sys_transaction</code>.
     */
    public Timestamp getSysTransaction() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ehr.folder.sys_period</code>.
     */
    public void setSysPeriod(SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> value) {
        set(7, value);
    }

    /**
     * Getter for <code>ehr.folder.sys_period</code>.
     */
    public SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> getSysPeriod() {
        return (SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>) get(7);
    }

    /**
     * Setter for <code>ehr.folder.has_audit</code>.
     */
    public void setHasAudit(UUID value) {
        set(8, value);
    }

    /**
     * Getter for <code>ehr.folder.has_audit</code>.
     */
    public UUID getHasAudit() {
        return (UUID) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, UUID, String, String, Boolean, ItemStructure, Timestamp, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>, UUID> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UUID, UUID, String, String, Boolean, ItemStructure, Timestamp, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>, UUID> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Folder.FOLDER.ID;
    }

    @Override
    public Field<UUID> field2() {
        return Folder.FOLDER.IN_CONTRIBUTION;
    }

    @Override
    public Field<String> field3() {
        return Folder.FOLDER.NAME;
    }

    @Override
    public Field<String> field4() {
        return Folder.FOLDER.ARCHETYPE_NODE_ID;
    }

    @Override
    public Field<Boolean> field5() {
        return Folder.FOLDER.ACTIVE;
    }

    @Override
    public Field<ItemStructure> field6() {
        return Folder.FOLDER.DETAILS;
    }

    @Override
    public Field<Timestamp> field7() {
        return Folder.FOLDER.SYS_TRANSACTION;
    }

    @Override
    public Field<SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>> field8() {
        return Folder.FOLDER.SYS_PERIOD;
    }

    @Override
    public Field<UUID> field9() {
        return Folder.FOLDER.HAS_AUDIT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getInContribution();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getArchetypeNodeId();
    }

    @Override
    public Boolean component5() {
        return getActive();
    }

    @Override
    public ItemStructure component6() {
        return getDetails();
    }

    @Override
    public Timestamp component7() {
        return getSysTransaction();
    }

    @Override
    public SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> component8() {
        return getSysPeriod();
    }

    @Override
    public UUID component9() {
        return getHasAudit();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getInContribution();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getArchetypeNodeId();
    }

    @Override
    public Boolean value5() {
        return getActive();
    }

    @Override
    public ItemStructure value6() {
        return getDetails();
    }

    @Override
    public Timestamp value7() {
        return getSysTransaction();
    }

    @Override
    public SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> value8() {
        return getSysPeriod();
    }

    @Override
    public UUID value9() {
        return getHasAudit();
    }

    @Override
    public FolderRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public FolderRecord value2(UUID value) {
        setInContribution(value);
        return this;
    }

    @Override
    public FolderRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public FolderRecord value4(String value) {
        setArchetypeNodeId(value);
        return this;
    }

    @Override
    public FolderRecord value5(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public FolderRecord value6(ItemStructure value) {
        setDetails(value);
        return this;
    }

    @Override
    public FolderRecord value7(Timestamp value) {
        setSysTransaction(value);
        return this;
    }

    @Override
    public FolderRecord value8(SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> value) {
        setSysPeriod(value);
        return this;
    }

    @Override
    public FolderRecord value9(UUID value) {
        setHasAudit(value);
        return this;
    }

    @Override
    public FolderRecord values(UUID value1, UUID value2, String value3, String value4, Boolean value5, ItemStructure value6, Timestamp value7, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> value8, UUID value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FolderRecord
     */
    public FolderRecord() {
        super(Folder.FOLDER);
    }

    /**
     * Create a detached, initialised FolderRecord
     */
    public FolderRecord(UUID id, UUID inContribution, String name, String archetypeNodeId, Boolean active, ItemStructure details, Timestamp sysTransaction, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> sysPeriod, UUID hasAudit) {
        super(Folder.FOLDER);

        setId(id);
        setInContribution(inContribution);
        setName(name);
        setArchetypeNodeId(archetypeNodeId);
        setActive(active);
        setDetails(details);
        setSysTransaction(sysTransaction);
        setSysPeriod(sysPeriod);
        setHasAudit(hasAudit);
    }
}