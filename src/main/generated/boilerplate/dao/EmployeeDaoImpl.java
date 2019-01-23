package boilerplate.dao;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.21.1-SNAPSHOT" }, date = "2019-01-23T22:32:00.070+0900")
public class EmployeeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements boilerplate.dao.EmployeeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.21.1-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(boilerplate.dao.EmployeeDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(boilerplate.dao.EmployeeDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(boilerplate.dao.EmployeeDao.class, "select");

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(boilerplate.dao.EmployeeDao.class, "insert", boilerplate.entity.Employee.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(boilerplate.dao.EmployeeDao.class, "update", boilerplate.entity.Employee.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(boilerplate.dao.EmployeeDao.class, "delete", boilerplate.entity.Employee.class);

    /** */
    public EmployeeDaoImpl() {
        super(boilerplate.AppConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public EmployeeDaoImpl(java.sql.Connection connection) {
        super(boilerplate.AppConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public EmployeeDaoImpl(javax.sql.DataSource dataSource) {
        super(boilerplate.AppConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<boilerplate.entity.Employee> selectAll() {
        entering("boilerplate.dao.EmployeeDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/boilerplate/dao/EmployeeDao/selectAll.sql");
            __query.setEntityType(boilerplate.entity._Employee.getSingletonInternal());
            __query.setCallerClassName("boilerplate.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<boilerplate.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<boilerplate.entity.Employee>(boilerplate.entity._Employee.getSingletonInternal()));
            java.util.List<boilerplate.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("boilerplate.dao.EmployeeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("boilerplate.dao.EmployeeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public boilerplate.entity.Employee selectById(java.lang.Integer id) {
        entering("boilerplate.dao.EmployeeDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/boilerplate/dao/EmployeeDao/selectById.sql");
            __query.setEntityType(boilerplate.entity._Employee.getSingletonInternal());
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("boilerplate.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<boilerplate.entity.Employee> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<boilerplate.entity.Employee>(boilerplate.entity._Employee.getSingletonInternal()));
            boilerplate.entity.Employee __result = __command.execute();
            __query.complete();
            exiting("boilerplate.dao.EmployeeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("boilerplate.dao.EmployeeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<boilerplate.entity.Employee> select() {
        entering("boilerplate.dao.EmployeeDaoImpl", "select");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/boilerplate/dao/EmployeeDao/select.sql");
            __query.setEntityType(boilerplate.entity._Employee.getSingletonInternal());
            __query.setCallerClassName("boilerplate.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("select");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<boilerplate.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<boilerplate.entity.Employee>(boilerplate.entity._Employee.getSingletonInternal()));
            java.util.List<boilerplate.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("boilerplate.dao.EmployeeDaoImpl", "select", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("boilerplate.dao.EmployeeDaoImpl", "select", __e);
            throw __e;
        }
    }

    @Override
    public int insert(boilerplate.entity.Employee employee) {
        entering("boilerplate.dao.EmployeeDaoImpl", "insert", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<boilerplate.entity.Employee> __query = getQueryImplementors().createAutoInsertQuery(__method3, boilerplate.entity._Employee.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(employee);
            __query.setCallerClassName("boilerplate.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("boilerplate.dao.EmployeeDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("boilerplate.dao.EmployeeDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(boilerplate.entity.Employee employee) {
        entering("boilerplate.dao.EmployeeDaoImpl", "update", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<boilerplate.entity.Employee> __query = getQueryImplementors().createAutoUpdateQuery(__method4, boilerplate.entity._Employee.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(employee);
            __query.setCallerClassName("boilerplate.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("boilerplate.dao.EmployeeDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("boilerplate.dao.EmployeeDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(boilerplate.entity.Employee employee) {
        entering("boilerplate.dao.EmployeeDaoImpl", "delete", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<boilerplate.entity.Employee> __query = getQueryImplementors().createAutoDeleteQuery(__method5, boilerplate.entity._Employee.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(employee);
            __query.setCallerClassName("boilerplate.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("boilerplate.dao.EmployeeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("boilerplate.dao.EmployeeDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
