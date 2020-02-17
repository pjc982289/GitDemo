package com.pjc.study.innerclass1224;

/**
 * @program: javales
 * @description: 外部类
 * @author: pjc
 * @create: 2020-02-11 13:51
 **/
public class OuterClass {

    private Integer index;
    private String name;
    public OuterClass() {}
    public OuterClass(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    //内部类：定义在其他类中的类，成为内部类
    public class InnerClass{
        private String name;
        public InnerClass() {
        }
        public InnerClass(String name) {
            this.name = name;
        }

        private void pringInfo(){

            String name = "内部类方法中的name";
//            name = "";
            /**
             * 使用局部内部类
             * */
//            class PrintClass{
//                void print(){
//                    System.out.println(name);
//                    System.out.println(","+InnerClass.this.name);
//                    System.out.println(","+OuterClass.this.name);
//                }
//
//            }
//            new PrintClass().print();

            /**
             * 使用匿名内部类来实现打印
             * */
            new PrintInterface(){

                @Override
                public void print() {
                    System.out.println(name);
                    System.out.println(","+InnerClass.this.name);
                    System.out.println(","+OuterClass.this.name);
                }
            }.print();

//            class PrintClassImple extends PrintClass{
//
//            } 相当于这个意思,创建了一个新的类
            //new相当于传给父类的构造器
            new PrintClass("名字？"){
                @Override
                public void print() {
                    //super.name输出为 名字？，但是类的name修饰不能为private
//                    System.out.println(super.name);
                    System.out.println(name);
                    System.out.println(","+InnerClass.this.name);
                    System.out.println(","+OuterClass.this.name);
                }
            }.print();

            /**
             * 成员内部类的测试
             * */
//            StringBuilder tmp = new StringBuilder();
//            tmp.append("index = " + index);
//            //直接调用是调用内部类的参数
//            tmp.append(",name = " + name);
//            //调用外部类的参数
//            tmp.append(",name = " + OuterClass.this.name);
//            System.out.println(tmp.toString());
        }
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass(1,"外部类名");

        InnerClass innerClass = out.new InnerClass("内部类名");
//        InnerClass innerClass = out.new InnerClass();

        innerClass.pringInfo();
    }
}


