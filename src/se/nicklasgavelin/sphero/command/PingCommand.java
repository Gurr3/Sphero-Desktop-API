package se.nicklasgavelin.sphero.command;

import se.nicklasgavelin.sphero.Robot;

/**
 * Ping command to keep the connection to the Sphero alive. The original Ping
 * command doesn't work as expected as a CODE_ERROR_UNSUPPORTED is returned.
 * Modified the FrontLEDCommand to work as a ping command to.
 *
 * @author Nicklas Gavelin
 */
public class PingCommand extends DeviceCommand
{
    private float brightness;

    /**
     * Create a ping command for a given robot
     *
     * @param r The robot the ping command is for (needed for some values)
     */
    public PingCommand( Robot r )
    {
        super( DEVICE_COMMAND.CUSTOM_PING ); //CoreCommandPing, CoreDeviceId );
        this.brightness = r.getLed().getFrontLEDBrightness();
    }


    @Override
    public byte[] getPacketData()
    {
        byte[] data = new byte[ 1 ];
        data[0] = ( byte ) ( int ) (255.0D * this.brightness);

        return data;
    }
}
