package com.upGrad;

class OnlineOrderServiceImpl implements OnlineOrderService {
    public void acceptOnlineOrder() {
        //logic for placing online order
    }
    public void payOnline() {
        //logic for paying online
    }
}

class TelephoneOrderServiceImpl implements TelephoneOrderService {
    public void takeTelephoneOrder() {
        //logic for placing telephone order
    }
    public void payOnline() {
        //logic for paying online
    }
}

class WalkInOrderServiceImpl implements WalkInOrderService{
    public void walkInCustomerOrder() {
        //logic for placing walkin order
    }
    public void payInPerson() {
        //logic for paying in person
    }
}
