package boilerplate.dao;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.21.1-SNAPSHOT" }, date = "2019-01-23T22:31:59.963+0900")
public class AppDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements boilerplate.dao.AppDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.21.1-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(boilerplate.dao.AppDao.class, "create");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(boilerplate.dao.AppDao.class, "drop");

    /** */
    public AppDaoImpl() {
        super(boilerplate.AppConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public AppDaoImpl(java.sql.Connection connection) {
        super(boilerplate.AppConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public AppDaoImpl(javax.sql.DataSource dataSource) {
        super(boilerplate.AppConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected AppDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected AppDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected AppDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public void create() {
        entering("boilerplate.dao.AppDaoImpl", "create");
        try {
            org.seasar.doma.jdbc.query.SqlFileScriptQuery __query = getQueryImplementors().createSqlFileScriptQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setScriptFilePath("META-INF/boilerplate/dao/AppDao/create.script");
            __query.setCallerClassName("boilerplate.dao.AppDaoImpl");
            __query.setCallerMethodName("create");
            __query.setBlockDelimiter("");
            __query.setHaltOnError(true);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.ScriptCommand __command = getCommandImplementors().createScriptCommand(__method0, __query);
            __command.execute();
            __query.complete();
            exiting("boilerplate.dao.AppDaoImpl", "create", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("boilerplate.dao.AppDaoImpl", "create", __e);
            throw __e;
        }
    }

    @Override
    public void drop() {
        entering("boilerplate.dao.AppDaoImpl", "drop");
        try {
            org.seasar.doma.jdbc.query.SqlFileScriptQuery __query = getQueryImplementors().createSqlFileScriptQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setScriptFilePath("META-INF/boilerplate/dao/AppDao/drop.script");
            __query.setCallerClassName("boilerplate.dao.AppDaoImpl");
            __query.setCallerMethodName("drop");
            __query.setBlockDelimiter("");
            __query.setHaltOnError(true);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.ScriptCommand __command = getCommandImplementors().createScriptCommand(__method1, __query);
            __command.execute();
            __query.complete();
            exiting("boilerplate.dao.AppDaoImpl", "drop", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("boilerplate.dao.AppDaoImpl", "drop", __e);
            throw __e;
        }
    }

}
