using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Native.Blowing.RNNativeBlowing
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNNativeBlowingModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNNativeBlowingModule"/>.
        /// </summary>
        internal RNNativeBlowingModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNNativeBlowing";
            }
        }
    }
}
