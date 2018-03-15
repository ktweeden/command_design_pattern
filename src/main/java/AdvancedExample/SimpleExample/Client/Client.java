package AdvancedExample.SimpleExample.Client;

import AdvancedExample.SimpleExample.Commands.CoolCommand;
import AdvancedExample.SimpleExample.Commands.HeatCommand;
import AdvancedExample.SimpleExample.Commands.SwitchOffCommand;
import AdvancedExample.SimpleExample.Commands.SwitchOnCommand;
import AdvancedExample.SimpleExample.Invoker.Button;
import AdvancedExample.SimpleExample.Reciever.AirConditioner;
import AdvancedExample.SimpleExample.Reciever.Light;

public class Client {

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Light light = new Light();
        Button button = new Button();
        SwitchOnCommand switchOnLightCommand = new SwitchOnCommand(light);
        SwitchOffCommand switchOffLightCommand = new SwitchOffCommand(light);
        SwitchOnCommand switchOnACCommand = new SwitchOnCommand(airConditioner);
        SwitchOffCommand switchOffACCommand = new SwitchOffCommand(airConditioner);
        HeatCommand heatCommand = new HeatCommand(airConditioner);
        CoolCommand coolCommand = new CoolCommand(airConditioner);


        button.setCommand(switchOnLightCommand);
        button.pressButton();
        System.out.println("Is light on? " + light.getIsOn());

        button.setCommand(switchOffLightCommand);
        button.pressButton();
        System.out.println("Is light on? " + light.getIsOn());

        button.setCommand(switchOnACCommand);
        button.pressButton();
        System.out.println("Is AC on? " + airConditioner.getIsOn());

        button.setCommand(switchOffACCommand);
        button.pressButton();
        System.out.println("Is AC on? " + airConditioner.getIsOn());

        button.setCommand(heatCommand);
        button.pressButton();
        System.out.println("The AC is now " + airConditioner.getTemperature());

        button.setCommand(coolCommand);
        button.pressButton();
        System.out.println("The AC is now " + airConditioner.getTemperature());
    }
}