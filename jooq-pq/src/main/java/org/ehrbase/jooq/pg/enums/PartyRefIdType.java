/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.enums;


import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum PartyRefIdType implements EnumType {

    generic_id("generic_id"),

    object_version_id("object_version_id"),

    hier_object_id("hier_object_id"),

    undefined("undefined");

    private final String literal;

    private PartyRefIdType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public String getName() {
        return "party_ref_id_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static PartyRefIdType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(PartyRefIdType.class, literal);
    }
}