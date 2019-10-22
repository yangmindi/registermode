package com.atguigu.principle.inversion.imporve;


public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);


//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();


        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}

//interface IOpenAndClose{
//    public void open(ITV tv);
//}
//
//interface IOpenAndClose{
//    public void open();
//}

interface IOpenAndClose{
    public void open();
    public void setTv(ITV tv);
}

interface ITV{
    public void play();
}

//class OpenAndClose implements IOpenAndClose{
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

//class OpenAndClose implements IOpenAndClose{
//    public ITV tv;
//
//    public OpenAndClose(ITV tv){
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}


class OpenAndClose implements IOpenAndClose{
    private ITV tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}
