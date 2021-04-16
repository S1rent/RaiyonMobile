package com.philipprayitno.rayonmobile

object ProductData {
    private val productNames = arrayOf(
        "Nintendo eShop Gift Card",
        "Fortnite",
        "Point Blank",
        "Call Of Duty Mobile",
        "Playstation Network Card",
        "Valorant",
        "Apex Legends",
        "Steam",
        "Google Play Giftcard",
        "Spotify"
    )

    private val productDetails = arrayOf(
        "The perfect gift for anyone who loves to play—including you. Choose from over 1,000 new, classic and indie games – delivered directly to your Nintendo Switch, Wii U™ or Nintendo 3DS™ family of systems." +
                "\n\nAvailable in $10, $20, $35, and $50",
        "Fortnite is a free-to-play Battle Royale game with numerous game modes for every type of game player. Watch a concert, build an island or fight.\n" +
                "\nV-bucks is available in 1000, 2000, 3000, 4000, and 5000",
        "Point Blank is a fast-paced online first-person shooter, and is similar in terms of gameplay to Counter-Strike. It also features destructible and dynamic environments, as well as deeper character and skill customisation options.\n" +
                "\n" +
                "In Point Blank, players join either the Free Rebels or CT-Force team (the Free Rebels are based on the Terrorists from Counter-Strike, while CT-Force is based on the Counter-Terrorists). Each team attempts to complete their mission objective and/or eliminate the opposing team. Each round starts with the two teams spawning simultaneously, usually at opposite ends of the map from each other.\n\n" +
                "Point Blank Cash is available in 1200, 2400, 3600, 6000, and 120000",
        "Call of Duty: Mobile is a free-to-play shooter video game developed by TiMi Studios and published by Activision for Android and iOS. Released on 1 October 2019, the game saw one of the largest mobile game launches in history, generating over US\$480 million with 270 million downloads within a year. The game was published in other regions by Garena, Tencent Games, and VNG Games.\n\n" +
                "Call of Duty Point is available in 16CP, 32CP, 64CP, and 128CP",
        "PlayStation Store gift cards\n" +
                "Buy a PlayStation Store gift card from an online retailer and they will email you a code to redeem via our digital store on your PlayStation console or via any web browser.\n\n" +
                "PSN Card is available in IDR 100.000, IDR 200.000, IDR 300.000, and IDR 600.000",
        "Valorant is a team-based tactical shooter and first-person shooter set in the near future.[2][3][4][5] Players play as one of a set of agents, characters designed based on several countries and cultures around the world.[5] In the main game mode, players are assigned to either the attacking or defending team with each team having five players on it. Agents have unique abilities, each requiring charges, as well as a unique ultimate ability that requires charging through kills, deaths, or spike actions. Every player starts each round with a \"classic\" pistol and one or more \"signature ability\" charges.[3] Other weapons and ability charges can be purchased using an in-game economic system that awards money based on the outcome of the previous round, any kills the player is responsible for, and any actions taken with the spike. The game has an assortment of weapons including secondary guns like sidearms and primary guns like submachine guns, shotguns, machine guns, assault rifles and sniper rifles.[6][7] There are automatic and semi-automatic weapons that have a shooting pattern that has to be controlled by the player to be able to shoot accurately.[7] Different agents allow players to find more ways to plant the Spike and style on enemies with scrappers, strategists, and hunters of every description. It currently offers 15 agents to choose from.[8][9] They are Brimstone, Phoenix, Sage, Sova, Viper, Cypher, Reyna, Killjoy, Breach, Omen, Jett, Raze, Skye, Yoru, and Astra.\n\n" +
                "Valorant Point is available in 1375VP, 2475VP, 3500VP, and 5000VP",
        "Apex Legends is a free-to-play battle royale game developed by Respawn Entertainment and published by Electronic Arts. It was released for Microsoft Windows, PlayStation 4, and Xbox One in February 2019, and for Nintendo Switch in March 2021.[2] Ports for Android and iOS are also scheduled to be released by 2022.[3] The game supports cross-platform play.[4]\n" +
                "\n" +
                "In Apex Legends, up to 20 three-person squads or 30 two-person duos land on an island and search for weapons and supplies before attempting to defeat all other players in combat. The available play area on the island shrinks over time, forcing players to keep moving or else find themselves outside the play area which can be fatal. The final team alive wins the round. The game is set in the same science fiction universe as Respawn Entertainment's Titanfall and Titanfall 2.[5]\n\n" +
                "Apex legends coin is available in 1000, 2400, 5000, and 12000",
        "Steam is a video game digital distribution service by Valve. It was launched as a standalone software client in September 2003 as a way for Valve to provide automatic updates for their games, and expanded to include games from third-party publishers. Steam has also expanded into an online web-based and mobile digital storefront. Steam offers digital rights management (DRM), server hosting, video streaming, and social networking services. It also provides the user with installation and automatic updating of games, and community features such as friends lists and groups, cloud storage, and in-game voice and chat functionality.\n\n" +
                "Steam Wallet is available in IDR 6.000, IDR 8.000, IDR 12.000, IDR 45.000, and IDR 120.000",
        "Google Play Store, formerly Android Market, is a digital distribution service operated and developed by Google. It serves as the official app store for certified devices running on the Android operating system, allowing users to browse and download applications developed with the Android software development kit (SDK) and published through Google. Google Play also serves as a digital media store, offering music, books, movies, and television programs.[2]\n" +
                "\n" +
                "Applications are available through Google Play either free of charge or at a cost. They can be downloaded directly on an Android device through the proprietary Play Store mobile app or by deploying the application to a device from the Google Play website. Applications utilizing hardware capabilities of a device can be targeted to users of devices with specific hardware components, such as a motion sensor (for motion-dependent games) or a front-facing camera (for online video calling). The Google Play store had over 82 billion app downloads in 2016 and reached over 3.5 million apps published in 2017,[3] while after a purge of apps is back to over 3 million.[4] It has been the subject of multiple issues concerning security, in which malicious software has been approved and uploaded to the store and downloaded by users, with varying degrees of severity." +
                "\n\nGoogle Play Gift Card is available in IDR 10.000, IDR 20.000, IDR 50.000, and IDR 100.000",
        "Spotify offers digital copyright restricted recorded music and podcasts, including more than 70 million songs, from record labels and media companies.[8] As a freemium service, basic features are free with advertisements and limited control, while additional features, such as offline listening and commercial-free listening, are offered via paid subscriptions. Users can search for music based on artist, album, or genre, and can create, edit, and share playlists." +
                "\n\nSpotify package is available in 1month, 3month, 6month, and 1 year subscription."
    )

    private val productImages = intArrayOf(
        R.drawable.loneup4,
        R.drawable.loneup6,
        R.drawable.loneup7,
        R.drawable.loneup9,
        R.drawable.loneup3,
        R.drawable.loneup8,
        R.drawable.loneup5,
        R.drawable.loneup2,
        R.drawable.loneup,
        R.drawable.loneup10
    )

    val listData: ArrayList<Product>
        get() {
            val list = arrayListOf<Product>()
            for (position in productNames.indices) {
                val product = Product()
                product.name = productNames[position]
                product.detail = productDetails[position]
                product.photo = productImages[position]
                list.add(product)
            }
            return list
        }
}