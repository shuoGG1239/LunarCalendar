## 农历公历转换工具
支持公历范围为：1900-01-31到2099-12-31范围内，农历日期和公历日期的转换。

## 使用方法
```java
// 农历转公历
LocalDate d0 = LunarUtil.lunar2Solar(2018, 7, 5);
// 公历转农历
LunarCalendar c0 = LunarUtil.solar2Lunar(2018, 5, 22);
```

## 实现思路
通过记录1900年-2099年间的农历信息到二维数组中，经过查询和相关计算就能实现公历日期和农历日期之间的转化。
例如： <br>
{ 8, 131, 301, 331, 429, 528, 627, 726, 825, 924, 1023, 1122, 1222, 1320 }, // 1900 <br>
{ 0, 219, 320, 419, 518, 616, 716, 814, 913, 1012, 1111, 1211, 1310 }, // 1901 <br>
...
* 每个数组的第一个数表示该年闰月月份，为0表示不闰月.
* 数组中其他数表示该月初一对应的公历日期.

## License
[The MIT License](http://opensource.org/licenses/MIT)

## Fork from
[LunarCalendar](https://github.com/heqiao2010/LunarCalendar)

## 参考
[conis用JS实现的lunar](http://github.com/conis/lunar)
