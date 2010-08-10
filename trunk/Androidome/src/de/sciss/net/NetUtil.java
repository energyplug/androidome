/*
 *  NetUtil.java
 *  de.sciss.net (NetUtil)
 *
 *  Copyright (c) 2004-2009 Hanns Holger Rutz. All rights reserved.
 *
 *	This library is free software; you can redistribute it and/or
 *	modify it under the terms of the GNU Lesser General Public
 *	License as published by the Free Software Foundation; either
 *	version 2.1 of the License, or (at your option) any later version.
 *
 *	This library is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *	Lesser General Public License for more details.
 *
 *	You should have received a copy of the GNU Lesser General Public
 *	License along with this library; if not, write to the Free Software
 *	Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *
 *	For further information, please contact Hanns Holger Rutz at
 *	contact@sciss.de
 *
 *
 *  Changelog:
 *		26-May-05	created
 */

package de.sciss.net;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 *	A static class which contains information
 *	methods. In a future version it may contain
 *	more useful utility methods.
 *
 *  @author		Hanns Holger Rutz
 *  @version	0.38, 18-Jul-09
 */
public class NetUtil
{
	private static final double VERSION	= 0.38;
	private static final ResourceBundle resBundle = ResourceBundle.getBundle( "NetUtilStrings" );

    private NetUtil() { /* empty */ }

	
	/**
	 *	Returns the library's version.
	 *
	 *	@return	the current version of NetUtil
	 */
	public static final double getVersion()
	{
		return VERSION;
	}

	/**
	 *	Returns a copyright information string
	 *	about the library
	 *
	 *	@return	text string which can be displayed
	 *			in an about box
	 */
	public static final String getCopyrightString()
	{
		return NetUtil.getResourceString( "copyright" );
	}

	/**
	 *	Returns a license and website information string
	 *	about the library
	 *
	 *	@return	text string which can be displayed
	 *			in an about box
	 */
	public static final String getCreditsString()
	{
		return NetUtil.getResourceString( "credits" );
	}

	/**
	 *	Returns a string from the library's string
	 *	resource bundle (currently localized
	 *	english and german). This is used by the
	 *	classes of the library, you shouldn't use
	 *	it yourself.
	 *
	 *	@param	key	lookup dictionary key
	 *	@return	(localized) human readable string for
	 *			the given key or placeholder string if
	 *			the resource wasn't found
	 */
	public static final String getResourceString( String key )
	{
		try {
			return resBundle.getString( key );
		}
		catch( MissingResourceException e1 ) {
			return( "[Missing Resource: " + key + "]" );
		}
	}
}