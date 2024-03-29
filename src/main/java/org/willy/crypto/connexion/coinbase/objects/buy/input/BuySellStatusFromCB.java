package org.willy.crypto.connexion.coinbase.objects.buy.input;

import com.google.gson.annotations.SerializedName;

/**
 * Enumeration of buy or sell status
 * <ul>
 *     <li>created</li>
 *     <li>completed</li>
 *     <li>canceled</li>
 * </ul>
 */
public enum BuySellStatusFromCB {
    @SerializedName("created")
    CREATED ,
    @SerializedName("completed")
    COMPLETED,
    @SerializedName("canceled")
    CANCELED;
}
