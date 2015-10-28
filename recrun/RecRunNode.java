package com.qualcomm.ftcrobotcontroller.opmodes.recrun;

import java.io.*;

public class RecRunNode implements Serializable
{
    int command;
    double value;
    long duration;

    public RecRunNode(int command, double value, long duration){
	this.command = command;
	this.value = value;
	this.duration = duration;
    }
}
