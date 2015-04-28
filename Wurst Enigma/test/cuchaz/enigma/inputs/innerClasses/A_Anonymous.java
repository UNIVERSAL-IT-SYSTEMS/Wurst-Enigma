/*******************************************************************************
 * Copyright (c) 2015 Jeff Martin.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public
 * License v3.0 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * Contributors:
 * Jeff Martin - initial API and implementation
 ******************************************************************************/
package cuchaz.enigma.inputs.innerClasses;

public class A_Anonymous
{

	public void foo()
	{
		Runnable runnable = new Runnable()
		{
			@Override
			public void run()
			{
				// don't care
			}
		};
		runnable.run();
	}
}
