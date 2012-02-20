package se.nicklasgavelin.sphero.response;

import se.nicklasgavelin.sphero.command.DeviceCommand.DEVICE_COMMAND;

/**
 * Create a respons for the RawMotorCommand
 *
 * @author Nicklas Gavelin, nicklas.gavelin@gmail.com, Luleå University of Technology
 */
public class RawMotorResponse extends DeviceResponse
{
    /**
     * Create a RawMotorResponse from the received data
     *
     * @param data The received data
     */
    public RawMotorResponse( byte[] data )
    {
        super( DEVICE_COMMAND.RAW_MOTOR, data );
    }
}
