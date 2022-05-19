/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.HeadingRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Heading extends TableImpl<HeadingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.heading</code>
     */
    public static final Heading HEADING = new Heading();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HeadingRecord> getRecordType() {
        return HeadingRecord.class;
    }

    /**
     * The column <code>ehr.heading.code</code>.
     */
    public final TableField<HeadingRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>ehr.heading.name</code>.
     */
    public final TableField<HeadingRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.heading.description</code>.
     */
    public final TableField<HeadingRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private Heading(Name alias, Table<HeadingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Heading(Name alias, Table<HeadingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.heading</code> table reference
     */
    public Heading(String alias) {
        this(DSL.name(alias), HEADING);
    }

    /**
     * Create an aliased <code>ehr.heading</code> table reference
     */
    public Heading(Name alias) {
        this(alias, HEADING);
    }

    /**
     * Create a <code>ehr.heading</code> table reference
     */
    public Heading() {
        this(DSL.name("heading"), null);
    }

    public <O extends Record> Heading(Table<O> child, ForeignKey<O, HeadingRecord> key) {
        super(child, key, HEADING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public UniqueKey<HeadingRecord> getPrimaryKey() {
        return Keys.HEADING_PKEY;
    }

    @Override
    public Heading as(String alias) {
        return new Heading(DSL.name(alias), this);
    }

    @Override
    public Heading as(Name alias) {
        return new Heading(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Heading rename(String name) {
        return new Heading(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Heading rename(Name name) {
        return new Heading(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}