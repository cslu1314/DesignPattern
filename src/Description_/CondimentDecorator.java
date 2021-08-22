package Description_;

import java.io.FileInputStream;
import java.io.FilterInputStream;

public abstract class CondimentDecorator extends Beverage{

   //这里重写了Beverage的getDescription()方法
   public abstract String getDescription(); //所有调料装饰者都必须重新实现 getDescription()方法
}
