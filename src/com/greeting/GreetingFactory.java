package com.greeting;

import java.util.Locale;

/**
 * {@link Greeting} の実装クラスを生成するファクトリークラス
 *
 * @author t.yoshida
 */
public class GreetingFactory
{
	/**
	 * ロケールを基に {@link Greeting} の実装クラスを生成して返す。
	 *
	 * @param locale ロケール
	 * @return 実装クラス
	 */
	public static Greeting create(Locale locale)
	{
		Greeting greeting;

		String lang = locale.getLanguage();
		if(lang.equals("ja"))
		{
			greeting = new GreetingJA();
		}
		else
		{
			greeting = new GreetingEN();
		}

		return greeting;
	}
}
