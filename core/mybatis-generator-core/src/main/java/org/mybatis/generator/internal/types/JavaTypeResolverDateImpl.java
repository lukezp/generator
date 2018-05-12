package org.mybatis.generator.internal.types;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;

import java.sql.Types;
import java.util.Date;

/**
 * @Auther: lzp
 * @Date: 2018/5/13 00:59
 * @Description:
 */
public class JavaTypeResolverDateImpl extends JavaTypeResolverDefaultImpl {
    public JavaTypeResolverDateImpl() {
        super();
        typeMap.put(Types.DATE, new JdbcTypeInformation("TIMESTAMP", //$NON-NLS-1$
                new FullyQualifiedJavaType(Date.class.getName())));
    }
}
