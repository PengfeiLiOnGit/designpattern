package strategy;

import java.text.DecimalFormat;

public class RateCash implements CashSuper{
    @Override
    public double getResult(int a, int total) {
        // 计算小数点后两位
        DecimalFormat df = new DecimalFormat(".00");

        return Double.parseDouble(df.format((a + total) * 0.1));
    }
}
