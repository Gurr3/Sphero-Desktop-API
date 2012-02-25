package se.nicklasgavelin.sphero.response;

import se.nicklasgavelin.sphero.command.DeviceCommand.DEVICE_COMMAND;

/**
 * Response error the StabilizationCommand
 *
 * @author Nicklas Gavelin, nicklas.gavelin@gmail.com, Luleå University of Technology
 */
public class StabilizationResponse extends DeviceResponse
{
    /**
     * Create a StabilizationResponse from the received data
     *
     * @param data The received data
     */
    public StabilizationResponse( byte[] data )
    {
        super( DEVICE_COMMAND.STABILIZATION, data );
    }
}
