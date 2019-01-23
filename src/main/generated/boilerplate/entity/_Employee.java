package boilerplate.entity;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.21.1-SNAPSHOT" }, date = "2019-01-23T22:31:59.795+0900")
public final class _Employee extends org.seasar.doma.jdbc.entity.AbstractEntityType<boilerplate.entity.Employee> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.21.1-SNAPSHOT");
    }

    private static final _Employee __singleton = new _Employee();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("EMPLOYEE_SEQ");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, boilerplate.entity.Employee, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(boilerplate.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "", __namingType, false, __idGenerator);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, boilerplate.entity.Employee, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(boilerplate.entity.Employee.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "", __namingType, true, true, false);

    /** the age */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, boilerplate.entity.Employee, java.lang.Integer, Object> $age = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(boilerplate.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "age", "", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, boilerplate.entity.Employee, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(boilerplate.entity.Employee.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "", __namingType, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<boilerplate.entity.Employee>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?>> __entityPropertyTypeMap;

    private _Employee() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Employee";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?>> __map = new java.util.HashMap<>(4);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($name);
        __map.put("name", $name);
        __list.add($age);
        __map.put("age", $age);
        __list.add($version);
        __map.put("version", $version);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(boilerplate.entity.Employee entity, org.seasar.doma.jdbc.entity.PreInsertContext<boilerplate.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(boilerplate.entity.Employee entity, org.seasar.doma.jdbc.entity.PreUpdateContext<boilerplate.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(boilerplate.entity.Employee entity, org.seasar.doma.jdbc.entity.PreDeleteContext<boilerplate.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(boilerplate.entity.Employee entity, org.seasar.doma.jdbc.entity.PostInsertContext<boilerplate.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(boilerplate.entity.Employee entity, org.seasar.doma.jdbc.entity.PostUpdateContext<boilerplate.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(boilerplate.entity.Employee entity, org.seasar.doma.jdbc.entity.PostDeleteContext<boilerplate.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<boilerplate.entity.Employee, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, boilerplate.entity.Employee, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, boilerplate.entity.Employee, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, boilerplate.entity.Employee, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public boilerplate.entity.Employee newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<boilerplate.entity.Employee, ?>> __args) {
        boilerplate.entity.Employee entity = new boilerplate.entity.Employee();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("age") != null) __args.get("age").save(entity);
        if (__args.get("version") != null) __args.get("version").save(entity);
        return entity;
    }

    @Override
    public Class<boilerplate.entity.Employee> getEntityClass() {
        return boilerplate.entity.Employee.class;
    }

    @Override
    public boilerplate.entity.Employee getOriginalStates(boilerplate.entity.Employee __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(boilerplate.entity.Employee __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Employee getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Employee newInstance() {
        return new _Employee();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<boilerplate.entity.Employee> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
