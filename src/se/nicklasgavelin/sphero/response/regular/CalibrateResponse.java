package se.nicklasgavelin.sphero.response.regular;

import se.nicklasgavelin.sphero.response.ResponseMessage;

/**
 * Calibration response received after sending a CalibrateCommand
 *
 * @author Nicklas Gavelin, nicklas.gavelin@gmail.com, Luleå University of Technology
 */
public class CalibrateResponse extends ResponseMessage
{
    /**
     * Create a response from the received data
     *
     * @param data The received data
     */
    public CalibrateResponse( ResponseHeader rh )
    {
        super( rh );
    }
}
