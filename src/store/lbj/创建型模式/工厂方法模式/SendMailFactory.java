package store.lbj.创建型模式.工厂方法模式;

/**
 * 发送邮件工厂
 * 
 * 作者: zhoubang 
 * 日期：2015年10月26日 下午5:19:17
 */
public class SendMailFactory implements Provider {

    /**
     * 生产，创建邮件发送实例
     * 
     * 作者: zhoubang 
     * 日期：2015年10月26日 下午5:19:28
     * @return
     * (non-Javadoc)
     * @see Provider#produce()
     */
    @Override
    public Sender produce() {
        return new MailSender();
    }

}

