package jg.apps.design_patterns

@Module
@InstallIn (Singleton::class)
object AppModule {
    fun provideHamburger(): Hamburger {
        return hamburger.Builder()
            .cheese(true)
            .beef(true)
            .onions(true)
            .build()
    }

    }

