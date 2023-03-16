package spring6;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: DateFactory
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class DateFactory implements FactoryBean<Date> {

    private String strDate;

    public DateFactory(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
