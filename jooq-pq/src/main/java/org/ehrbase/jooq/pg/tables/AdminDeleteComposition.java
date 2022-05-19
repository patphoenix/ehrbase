/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.UUID;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.AdminDeleteCompositionRecord;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminDeleteComposition extends TableImpl<AdminDeleteCompositionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.admin_delete_composition</code>
     */
    public static final AdminDeleteComposition ADMIN_DELETE_COMPOSITION = new AdminDeleteComposition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminDeleteCompositionRecord> getRecordType() {
        return AdminDeleteCompositionRecord.class;
    }

    /**
     * The column <code>ehr.admin_delete_composition.num</code>.
     */
    public final TableField<AdminDeleteCompositionRecord, Integer> NUM = createField(DSL.name("num"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ehr.admin_delete_composition.contribution</code>.
     */
    public final TableField<AdminDeleteCompositionRecord, UUID> CONTRIBUTION = createField(DSL.name("contribution"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.admin_delete_composition.party</code>.
     */
    public final TableField<AdminDeleteCompositionRecord, UUID> PARTY = createField(DSL.name("party"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.admin_delete_composition.audit</code>.
     */
    public final TableField<AdminDeleteCompositionRecord, UUID> AUDIT = createField(DSL.name("audit"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.admin_delete_composition.attestation</code>.
     */
    public final TableField<AdminDeleteCompositionRecord, UUID> ATTESTATION = createField(DSL.name("attestation"), SQLDataType.UUID, this, "");

    private AdminDeleteComposition(Name alias, Table<AdminDeleteCompositionRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.UUID)
        });
    }

    private AdminDeleteComposition(Name alias, Table<AdminDeleteCompositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>ehr.admin_delete_composition</code> table
     * reference
     */
    public AdminDeleteComposition(String alias) {
        this(DSL.name(alias), ADMIN_DELETE_COMPOSITION);
    }

    /**
     * Create an aliased <code>ehr.admin_delete_composition</code> table
     * reference
     */
    public AdminDeleteComposition(Name alias) {
        this(alias, ADMIN_DELETE_COMPOSITION);
    }

    /**
     * Create a <code>ehr.admin_delete_composition</code> table reference
     */
    public AdminDeleteComposition() {
        this(DSL.name("admin_delete_composition"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public AdminDeleteComposition as(String alias) {
        return new AdminDeleteComposition(DSL.name(alias), this, parameters);
    }

    @Override
    public AdminDeleteComposition as(Name alias) {
        return new AdminDeleteComposition(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteComposition rename(String name) {
        return new AdminDeleteComposition(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteComposition rename(Name name) {
        return new AdminDeleteComposition(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, UUID, UUID, UUID, UUID> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteComposition call(
          UUID compoIdInput
    ) {
        AdminDeleteComposition result = new AdminDeleteComposition(DSL.name("admin_delete_composition"), null, new Field[] {
            DSL.val(compoIdInput, SQLDataType.UUID)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteComposition call(
          Field<UUID> compoIdInput
    ) {
        AdminDeleteComposition result = new AdminDeleteComposition(DSL.name("admin_delete_composition"), null, new Field[] {
            compoIdInput
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}