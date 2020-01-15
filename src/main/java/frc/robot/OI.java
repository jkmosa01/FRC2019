/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  public static XboxController controller;
  public static Joystick joystick;
  public static JoystickButton button2,button3,button4,button5,button6,button7,button8,button9,button10;
  public static JoystickButton button11,button12;
  public static Joystick steeringWheel;
  public OI(){
    controller = new XboxController(0);
    joystick = new Joystick(1);
    steeringWheel = new Joystick(2);
    button3 = new JoystickButton(joystick,3);
    button2 = new JoystickButton(joystick,2);
    button4 = new JoystickButton(joystick,4);
    button5 = new JoystickButton(joystick,5);
    button6 = new JoystickButton(joystick,6);
    button7 = new JoystickButton(joystick,7);
    button8 = new JoystickButton(joystick,8);
    button9 = new JoystickButton(joystick,9);
    button10 = new JoystickButton(joystick,10);
    button11 = new JoystickButton(joystick,11);
    button12 = new JoystickButton(joystick,12);
  }

  public static double deadZone (double val, double deadZone){
    if (Math.abs(val) > deadZone){
        if (val > 0){
            return (val - deadZone) / (1 - deadZone);
        } else {
            return -(-val - deadZone) / (1 - deadZone);
        }
    }
    return 0;
  }
}
